package com.mycompany.vaidarnamoroterminal.Controller;

import com.mycompany.vaidarnamoroterminal.Entity.Usuario;

public class UsuarioController {

    Usuario usuario = new Usuario();

    
    
    public UsuarioController(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioController() {
    }

    public void increaseAcertos(){
        int acertos = usuario.getAcertos();
        usuario.setAcertos(acertos+1);
        //this.Acertos = this.Acertos + 1; 
    }
    
    public void increaseErros(){
        usuario.setErros(usuario.getErros()+1);
        //this.Erros = this.Erros + 1; 
    }
}
