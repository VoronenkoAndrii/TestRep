
import generatedModels.IssueType;
import generatedModels.IssuesType;
import generatedModels.MessageDetailsType;
import generatedModels.MessageType;

import java.util.Collections;
import java.util.List;


public class Main {

       static String fileFolderPath = "C:\\Users\\andre\\IdeaProjects\\AcquaintanceWithGit\\src\\";
    public static void main(String[] args) {
      {
            MessageType message = XmlUtils.unmarshal(fileFolderPath + "exemel2.xml");
            System.out.println(message);
            message.setCustomerId("0000002");
            MessageDetailsType messageDetails = message.getMessageDetails();
            messageDetails.setMessageId("002");
            IssuesType issue =  message.getIssues();
            List<IssueType> issues =  issue.getIssue();
            if(issues!=null && !issues.isEmpty()){
                issues.get(0).setType("2");
            }
            System.out.println(message);
            XmlUtils.marshal(message, fileFolderPath + "result.xml");
        }
    }
}
