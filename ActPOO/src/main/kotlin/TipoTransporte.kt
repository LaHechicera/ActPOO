class TipoTransporte (
    private val tipo: String,
    private val marca: String,
    private val anio: Int,
    private val carga: Int,
    private val envio:Int
): TransporteCarga(){
    override fun descripcion(): String {
        return "$tipo ($marca - $anio - $carga KG) $$envio CLP"
    }

    fun excedeCarga(): Boolean{
        return carga > 8000
    }

    private val transportes = mutableListOf<TipoTransporte>()

    fun agregarTransporte(t: TipoTransporte){
        transportes.add(t)
    }


    fun mostrarBiblioteca(): String{
        if(transportes.isEmpty()) return "No ha agregado transportes"
        //else
        return transportes.joinToString(separator = "\n"){transporte ->
            "${transporte.descripcion()}"
        }
    }

    //Para que el usuario agregue transportes
    fun agregarTransporte(
        tipo: String,
        marca: String,
        anio: Int,
        carga: Int,
        envio: Int
    ) {
        val nuevoTransporte = TipoTransporte(tipo, marca, anio, carga, envio)
        transportes.add(nuevoTransporte)
    }


}