/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author tiago
 */
public class EmptyCollectionException extends Exception{
    public EmptyCollectionException(String msg){
        super(msg);
    }
}
