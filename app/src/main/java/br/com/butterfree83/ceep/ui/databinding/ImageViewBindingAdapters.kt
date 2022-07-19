package br.com.butterfree83.ceep.ui.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.butterfree83.ceep.ui.extensions.carregaImagem

@BindingAdapter("carregaImagem")
fun ImageView.carregaImagemPorUrl(url: String?){
    url?.let { carregaImagem(url) }
}