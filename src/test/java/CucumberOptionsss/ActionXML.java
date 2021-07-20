package CucumberOptionsss;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
public class ActionXML {

	 public String getLocatorType(String PageName, String locatorName)
	{
	String data = "";
	
	try
	{
	File file = new File("E:\\Automation\\FrameWork\\src\\main\\java\\ObjectRepository\\ActionData.xml");
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
	data = eElement.getElementsByTagName("Locatortype").item(temp1).getTextContent();
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
	public String getLocatorAddress(String PageName,String locatorName)
	{
	String data = "";
	try
	{
	File file = new File("E:\\Automation\\FrameWork\\src\\main\\java\\ObjectRepository\\ActionData.xml");
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
	data = eElement.getElementsByTagName("Address").item(temp1).getTextContent();
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
