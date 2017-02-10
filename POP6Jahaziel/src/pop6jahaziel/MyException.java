/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pop6jahaziel;

/**
 *
 * @author ofici
 */
public class MyException extends Exception {

    public MyException() {
    }

    public MyException(String string) {
        super(string);
    }

    public MyException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MyException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MyException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

}
