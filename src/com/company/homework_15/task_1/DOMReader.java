package com.company.homework_15.task_1;

import com.company.homework_15.entity.Student;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
Есть студенты. У каждого студента есть номер группы, имя, фамилия, факультет. Создать XML файл, в котором описать 3-4 студента.
Прочитать из файла студентов при помощи DOM и SAX парсера
 */
public class DOMReader {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();

        InputStream resource = ClassLoader.getSystemResourceAsStream("xml/student.xml");
        Document document = documentBuilder.parse(resource);

        List<Student> students = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Student student = new Student();
                student.setId(node.getAttributes().getNamedItem("id").getNodeValue());

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "groupNum":
                                student.setGroupNum(Integer.parseInt(content));
                                break;
                            case "name":
                                student.setName(content);
                                break;
                            case "surname":
                                student.setSurname(content);
                                break;
                            case "faculty":
                                student.setFaculty(content);
                                break;
                        }
                    }
                }
                students.add(student);
            }
        }
        students.forEach(student -> System.out.println(student));
    }
}
