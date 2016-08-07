/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.dac.asyncall;

import javax.ejb.Asynchronous;
import javax.ejb.Singleton;

/**
 *
 * @author Anderson Souza
 */
@Singleton
public class AsyncService {

    @Asynchronous
    public void asyncMethod() {
        System.out.println("Inicio de chamada assíncrona" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fim de chamada assíncrona" + Thread.currentThread().getName());
    }

}
