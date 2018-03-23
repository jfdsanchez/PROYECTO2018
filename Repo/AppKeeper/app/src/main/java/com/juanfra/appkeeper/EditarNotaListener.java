package com.juanfra.appkeeper;

import android.content.Intent;

import com.juanfra.appkeeper.Models.Nota;

/**
 * Created by juanfra on 5/3/18.
 */

public interface EditarNotaListener {

    Nota editarNota (Integer id, String nombre, String descripcion, String idcategoria);
}
