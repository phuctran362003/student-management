/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicClass;

import Validation.MyValidation;

/**
 *
 * @author phuctrann <phuctgse172360@fpt.edu.vn>
 */
public class Subject {
    
    private String id;
    private String name;
    private int credit;

    public Subject() {
        id = name = "";
        credit = 0;
    }

    public Subject(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws Exception {
        if (!MyValidation.isEmptyString(id))
            this.id = id;
        else
            throw new Exception("Empty ID!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (!MyValidation.isEmptyString(name))
            this.name = name;
        else
            throw new Exception("Empty Name!");
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) throws Exception {
        if (MyValidation.checkIntNumMin(credit, 0))
            this.credit = credit;
        else
            throw new Exception("Invalid Credit!");
    }

}
