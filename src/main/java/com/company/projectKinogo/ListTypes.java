package com.company.projectKinogo;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.util.ArrayList;
import java.util.List;

public class ListTypes<T> {
    private String selectField;
    private String endField;
     private T element;

    public ListTypes(String selectField, String endField) {
        this.selectField = selectField;
        this.endField = endField;
    }

//    public ListTypes(T element) {
//        this.element = element;
//    }

    public String getSelectField() {
        return selectField;
    }

    public void setSelectField(String selectField) {
        this.selectField = selectField;
    }

    public String getEndField() {
        return endField;
    }

    public void setEndField(String endField) {
        this.endField = endField;
    }

//    public T getElement() {
//        return element;
//    }
//
//    public void setElement(T element) {
//        this.element = element;
//    }

    public List<String> getTypes(Element type) {
        List<String> typeList = new ArrayList<>();
        Element types = type.select(selectField).first();
        if (types != null && !types.text().isEmpty()) {
            if (/* element.getClass.equals...*/) {//что бы я тут не писала,всегда выдает ошибку
                Element currentElement = types.nextElementSibling();
                do {
                    if (!currentElement.text().isEmpty()) {
                        typeList.add(currentElement.text());
                    }
                    currentElement = currentElement.nextElementSibling();
                }
                while (!currentElement.text().equals(endField));
            } else {
                Node currentElement = types.nextSibling();
                do {
                    if (!currentElement.toString().isEmpty()) {
                        typeList.add(currentElement.toString().trim());
                    }
                    currentElement = currentElement.nextSibling();
                }
                while (!currentElement.toString().equals(endField));
            }
        } else {
            typeList.add("No information");
        }
        return typeList;
    }
}
