package CucumberOptionsss;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

 public class DataXMLHandler {
public int getNumberOfTags(String testCaseName, String tagName)
{
int length = 0;
try
{
File file = new File("C:\\Users\\CHETAN S\\git\\AutomationFrameWork\\src\\main\\java\\ObjectRepository\\DATA.xml");
DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
Document doc = dBuilder.parse(file);
System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
NodeList nList = doc.getElementsByTagName(testCaseName);
for (int temp = 0; temp < nList.getLength(); temp++) {
Node nNode = nList.item(temp);
System.out.println("Current Element: " + nNode.getNodeName());

if(nNode.getNodeName() == testCaseName)
{
Element eElement = (Element) nNode;
length = eElement.getElementsByTagName(tagName).getLength();
}
}
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
return length;
}

 public String getData(String testCaseName,String tagName,int index)
{
String data = "";

try
{
File file = new File("C:\\Users\\CHETAN S\\git\\AutomationFrameWork\\src\\main\\java\\ObjectRepository\\DATA.xml");
DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
Document doc = dBuilder.parse(file);
System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
NodeList nList = doc.getElementsByTagName(testCaseName);
for (int temp = 0; temp < nList.getLength(); temp++) {
Node nNode = nList.item(temp);
System.out.println("Current Element: " + nNode.getNodeName());

if(nNode.getNodeName() == testCaseName)
{
Element eElement = (Element) nNode;
data = eElement.getElementsByTagName(tagName).item(index).getTextContent();
System.out.println("data: " + data);
System.out.println("----------------------------");
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