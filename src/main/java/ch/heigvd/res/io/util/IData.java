/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.io.util;

import java.util.Collection;

/**
 *
 * @author crab_one
 */
public interface IData {
    
    public Collection<String> getKeys();
    public Collection<Object> getValues();
    
}
