package br.com.butterfree83.ceep.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.butterfree83.ceep.model.Nota
import br.com.butterfree83.ceep.repository.NotaRepository

class ListaNotasViewModel(repository: NotaRepository) : ViewModel() {

    val todas: LiveData<List<Nota>> = repository.buscaTodas()

}