package com.company.homework_15.task_1;

import com.company.homework_15.entity.Student;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

// +
class SAXHandler extends DefaultHandler {
    private List<Student> studList = new ArrayList<>();
    private Student stud = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "student":
                stud = new Student();
                stud.setId(attributes.getValue("id"));
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "student":
                studList.add(stud);
                break;
            case "groupNum":
                stud.setGroupNum(Integer.parseInt(content));
                break;
            case "name":
                stud.setName(content);
                break;
            case "surname":
                stud.setSurname(content);
                break;
            case "faculty":
                stud.setFaculty(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public List<Student> getStudList() {
        return studList;
    }
}
