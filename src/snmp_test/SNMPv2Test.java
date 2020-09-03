package snmp_test;
import java.io.IOException;
import org.snmp4j.PDU;
import org.snmp4j.CommunityTarget;
//import org.snmp4j.ScopedPDU;
import org.snmp4j.Snmp;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.mp.PduHandle;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.smi.VariableBinding;
import org.snmp4j.transport.DefaultTcpTransportMapping;
import org.snmp4j.util.DefaultPDUFactory;
import org.snmp4j.util.TableEvent;
import org.snmp4j.util.TableUtils;


import javax.xml.ws.Response;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

/**
 * @ClassName:SNMPv2Test
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/10 0010
 * @Version 1.0
 */
public class SNMPv2Test {
    public static void main(String[] args) throws IOException, InterruptedException{
        Snmp snmp = new Snmp(new DefaultTcpTransportMapping());
        snmp.listen();

        CommunityTarget target = new CommunityTarget();
        target.setCommunity(new OctetString("pubilc"));
        target.setVersion(SnmpConstants.version2c);
        target.setAddress(new UdpAddress("192.168.100.1"));
        target.setTimeout(3000);
        target.setRetries(1);

        sendRequest(snmp, createGetPdu(), target);
        sendRequest(snmp, createGetBulkPdu(), target);
        sendRequest(snmp, createGetNextPdu(), target);
        snmpwalk(snmp, target);

    }

    private static PDU createGetPdu(){
        PDU pdu = new PDU();
        pdu.setType(PDU.GET);
        pdu.add(new VariableBinding(new OID("xxxxxxx")));
        pdu.add(new VariableBinding(new OID("xxxxxxx")));
        pdu.add(new VariableBinding(new OID("xxxxxxx")));
        return pdu;
    }

    private static PDU createGetNextPdu(){
        PDU pdu = new PDU();
        pdu.setType(PDU.GETNEXT);
        pdu.add(new VariableBinding(new OID("xxxxxx")));
        pdu.add(new VariableBinding(new OID("xxxxxx")));
        return pdu;
    }

    private static PDU createGetBulkPdu(){
        PDU pdu = new PDU();
        pdu.setType(PDU.GETBULK);
        pdu.setMaxRepetitions(10);
        pdu.setNonRepeaters(0);
        pdu.add(new VariableBinding(new OID("xxxxxx")));
        return pdu;
    }

    private static void sendRequest(Snmp snmp, PDU pdu, CommunityTarget target) throws IOException{
        ResponseEvent responseEvent = snmp.send(pdu, target);
        PDU response = responseEvent.getResponse();

        if (response==null){
            System.out.println("Timeout....");
        }else {
            if (response.getErrorStatus() == PDU.noError){
//                Vector<? extends VariableBinding> vbs = response.getVariableBindings();
//                for (VariableBinding vb : vbs){
//                    System.out.println(vb + ", " + vb.getVariable().getSyntaxString());
//                }
                }
                else {
                System.out.println("Error:" + response.getErrorStatusText());
            }
            }
    }

    private static void snmpwalk(Snmp snmp, CommunityTarget target){
        TableUtils utils = new TableUtils(snmp, new DefaultPDUFactory(PDU.GETBULK));
        utils.setMaxNumRowsPerPDU(5);
        OID[] columOids = {
                new OID("xxxxxx"),
                new OID("xxxxxx"),
                new OID("xxxxxx")
        };
        List<TableEvent> l = utils.getTable(target, columOids, new OID("3"), new OID("10"));
        for (TableEvent e : l)
            System.out.println(e);
    }
}


