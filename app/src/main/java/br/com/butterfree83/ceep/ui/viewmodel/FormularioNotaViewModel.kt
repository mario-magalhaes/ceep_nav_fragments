package br.com.butterfree83.ceep.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import br.com.butterfree83.ceep.model.Nota
import br.com.butterfree83.ceep.repository.NotaRepository
import br.com.butterfree83.ceep.repository.Resource
import kotlinx.coroutines.Job

class FormularioNotaViewModel(private val repository: NotaRepository) : ViewModel() {

    private val job: Job = Job()

    fun buscaPorId(id: Long) = repository.buscaPorId(id)

    fun salva(nota: Nota): LiveData<Resource<Unit>> = repository.salva(nota, job)

}
