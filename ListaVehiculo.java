class ListaVehiculo
{
	nodoV cabeza=null;
//**********************************************************************************
	public boolean estavacia()// comprueba si esta vacio el nodo
	{
		if (cabeza==null)
		{
			return true;
	    }
		else
		{
			return false;
	    }
	}
//**********************************************************************************
	public void insertar(int placa,String color,String marca,int CedCliente,String Combustible) //funciona como una pila (inserta el dato primero en la lista)
	{
	 	nodoV minodo = new nodoV (placa,color,marca,CedCliente,Combustible);

	 	if (estavacia())
		{
			cabeza =minodo;
	    }
     	if(existe(placa))
     	{
			 System.out.println("     *** REGISTRADO ***");
	 	}
	 	else
        {
	    	minodo.sig = cabeza;
	      	cabeza=minodo;
        }
	}
//**********************************************************************************
	public void insertarF(int placa,String color,String marca,int CedCliente,String Combustible)//funciona como una cola(inserta el dato de ultimo en la lista)
	{
		nodoV minodo = new nodoV(placa,color,marca,CedCliente,Combustible);
		if(estavacia())
		{
			cabeza=minodo;
		}
		else
		{
			cabeza.insertarFinal(placa,color,marca,CedCliente,Combustible);
		}
	}
//**********************************************************************************
	public void ver() // metodo para unicamente ver los datos de la lista sin borrarlos
	{
		nodoV cabezaV=cabeza;
	   	if (cabezaV==null)
	   	{
	   		System.out.println("  *** NO HAY DATOS QUE MOSTRAR ***");
		}
	   	else
	   	{
	   		cabezaV.mostrar();
		}
   	}
//**********************************************************************************
 	public void verInverso()
 	{
		 nodoV cabezaV=cabeza;
		 cabezaV.mostrarInversa();
 	}
//**********************************************************************************
 	public void buscar(int placa)
 	{
		nodoV cabezaV=cabeza;
	 	nodoV cabezaAnterior=cabeza;
	 	if(existe(placa))
	 	{
	 		while(cabezaV!=null)// recorre los nodos hasta que algunos sea null
	 	 	{
	 	 		if(cabezaV.placa==placa)// si el numero de la cabeza virtual es igual al numero ingresado
	 	 		{
	 	 			cabezaV.imprimir();
	 	 		}
	 	 		cabezaAnterior=cabezaV; // cabeza anterior siempre apunta a la cabeza virtual
	 	 		cabezaV=cabezaV.sig; // cabeza virtual apunta al nodo siguiente
	 	 	}
	 	 }
	 	 else
	 	 {
	 	 	System.out.println("La persona elegida no esta registrada, verifique porfavor");
	 	 }
	 }
//**********************************************************************************
	public void borrar(int placa)// se usa para borrar el numero que la persona seleccione
	{
		nodoV cabezaV=cabeza;
		nodoV cabezaAnterior=cabeza;
		if(existe(placa))
		{
			while(cabezaV!=null)// recorre los nodos hasta que algunos sea null
			{
				if(cabezaV.placa==placa)// si el numero de la cabeza virtual es igual al numero ingresado
				{
					if(cabeza==cabezaV)
					{
						cabeza=cabeza.sig;
						cabezaV.sig=null;
					}
					else
					{
						cabezaAnterior.sig=cabezaV.sig; // el nodo cabezaAnterior apunta
						cabezaV.sig=null;
					}
				}
				cabezaAnterior=cabezaV; // cabeza anterior siempre apunta a la cabeza virtual
				cabezaV=cabezaV.sig; // cabeza virtual apunta al nodo siguiente
			}
		}
		else
		{
			System.out.println("El proceso buscado no existe");
		}
	 }
//**********************************************************************************
	public boolean existe(int placa)
	{
	 	nodoV cabezaV=cabeza;
	 	boolean encontrado= false;

	 	while(cabezaV!=null)
	 	{
			 if(cabezaV.placa==placa)
			 {
				 encontrado=true;
				 break;
			 }
			cabezaV=cabezaV.sig;
     	}
     	return encontrado;
 	}

//**********************************************************************************
	public int get_placa()
	{
		nodoV cabezaV=cabeza;
		return cabezaV.placa;
	}
	public String get_color()
	{
		nodoV cabezaV=cabeza;
		return cabezaV.color;
	}
	public String get_marca()
	{
		nodoV cabezaV=cabeza;
 		return cabezaV.marca;
	}
//**********************************************************************************
	public void pop()
	{
		if(estavacia())
		{
			System.out.println("No hay datos");
		}
		else
		{
			cabeza=cabeza.sig;
      	}
	}
}