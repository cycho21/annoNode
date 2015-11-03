package test;

import kr.ac.uos.ai.annotator.activemq.ActiveMQManager;
import kr.ac.uos.ai.annotator.activemq.Receiver;
import kr.ac.uos.ai.annotator.activemq.Sender;
import org.junit.Test;

/**
 *  Hello, Node!
 */
public class ApplicationTest
{

    private ActiveMQManager activemqManager;
    private Receiver rcvr;
    private Sender sdr;

    public ApplicationTest() {

    }

    private void init() {
        activemqManager = new ActiveMQManager();
        activemqManager.init("testQueue");

        sdr = new Sender();

    }

    @Test
    public void testApp() {
        init();
        startApp();
    }

    private void startApp() {

    }

}
