/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package app.mtr.interfaces;

import app.mtr.db.Parametro;
import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public interface IConnectionManager {
    boolean Connect();
    void Disconnect();
    <T> T ExecuteCommand(String command, ArrayList<Parametro<?>> parametros);
}
