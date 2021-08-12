package ObjectRepository;
<<<<<<< HEAD
=======

>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class PageObjectHandler {

	 

    public String getselector(String PageName, String locatorName)
    {
        String data = "";
        
        //Integer.parseInt(toString()) length = 0;
        try
        {
<<<<<<< HEAD
         File file = new File("C:\\Users\\CHETAN S\\git\\AutomationFrameWork\\src\\main\\java\\ObjectRepository\\PageObject.xml"); 
=======
         File file = new File("E:\\Automation\\FrameWork\\src\\main\\java\\ObjectRepository\\PageObject.xml"); 
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(file);
         
         System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
         NodeList nList = doc.getElementsByTagName(PageName);         
         for (int temp = 0; temp < nList.getLength(); temp++) {
             System.out.println(nList.getLength());
            Node nNode = nList.item(temp);
            System.out.println("Current Element: " + nNode.getNodeName());
           
            if(nNode.getNodeName() == PageName)
            {
                NodeList nLis1 = doc.getElementsByTagName(locatorName);  
                 for (int temp1 = 0; temp < nLis1.getLength(); temp1++) {
                Node nNode1 = nLis1.item(temp1);
                System.out.println("Next Element: " + nNode1.getNodeName());
                String val = nNode.getFirstChild().getNodeName().toString();
                if(nNode1.getNodeName() == locatorName)
                {
                    Element eElement = (Element) nNode1;
                    data = eElement.getElementsByTagName("selector").item(temp1).getTextContent();
                    break;
                }
               }
          }
        }
        }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
        return data;
    }
    
    public  String getvalue(String PageName,String locatorName,int index)
     {
        String data = "";
        try
        {
<<<<<<< HEAD
         File file = new File("C:\\Users\\CHETAN S\\git\\AutomationFrameWork\\src\\main\\java\\ObjectRepository\\PageObject.xml"); 
=======
         File file = new File("E:\\Automation\\FrameWork\\src\\main\\java\\ObjectRepository\\PageObject.xml"); 
>>>>>>> 36ccaa1fc3741adb2263f2bf6f3448e975ec6982
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(file);
        
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName(PageName);         
        for (int temp = 0; temp < nList.getLength(); temp++) {
           Node nNode = nList.item(temp);
           System.out.println("Current Element: " + nNode.getNodeName());
           
                  
            if(nNode.getNodeName() == PageName)
            {
                NodeList nLis1 = doc.getElementsByTagName(locatorName);  
                for (int temp1 = 0; temp < nLis1.getLength(); temp1++) {
               Node nNode1 = nLis1.item(temp1);
               System.out.println("Next Element: " + nNode1.getNodeName());
               String val = nNode.getFirstChild().getNodeName().toString();
               if(nNode1.getNodeName() == locatorName)
               {
                   Element eElement = (Element) nNode1;
                   data = eElement.getElementsByTagName("value").item(temp1).getTextContent();
                   break;
               }
                 }
            }
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return data;
        }

	
}
