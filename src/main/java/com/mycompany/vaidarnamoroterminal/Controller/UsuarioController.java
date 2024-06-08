package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Entity.Usuario;

public class UsuarioController {

    Usuario usuario = new Usuario();
    
    public void increaseAcertos(){
        usuario.setAcertos(usuario.getAcertos()+1);
        //this.Acertos = this.Acertos + 1; 
    }
    
    public void increaseErros(){
        usuario.setErros(usuario.getErros()-1);
        //this.Erros = this.Erros + 1; 
    }
}
