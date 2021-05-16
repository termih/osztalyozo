/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.RMainForm;

/**
 *
 * @author resahh
 */
public class RGuiControl {
    
    private RMainForm FMainFrm;

    public RGuiControl() {
        
        setFrame();
    }
    
    private void setFrame() {
        
        FMainFrm = new RMainForm();
        FMainFrm.setLocationRelativeTo( null );
        FMainFrm.setVisible( true );
    }
}
