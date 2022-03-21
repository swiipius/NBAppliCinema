/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author prohd
 */
public class ClientMembre extends Client{
    public ClientMembre(){
        if (age>50){
            status="senior";
            reduction=30;
        }
        else if (age<12){
            status="enfant";
            reduction=40;
        }
        else{
            status="reguliers";
            reduction=20;
        }
    }
}
