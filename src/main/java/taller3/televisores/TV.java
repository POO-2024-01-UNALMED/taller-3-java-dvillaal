package taller3.televisores;

public class TV {
	
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	public Marca getMarca() {
		return marca;
	}
	 public void setMarca(Marca marca) {
		 this.marca = marca;
	 }
	 
	 public int getCanal() {
		 return canal;
	 }
	 
	 public void setCanal(int canal) {
		 if (canal > 0 && canal <= 120 && estado == true) { 
				this.canal = canal;
		 }
	 }
	 
	 public int getPrecio() {
		 return precio;
	 }
	 
	 public void setPrecio(int precio) {
		 this.precio = precio;
	 }
	 
	 public void setVolumen(int volumen) {
			if (estado == true && volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
			}
		}
		
	 public int getVolumen() {
			return volumen;
		}
	 
	 public Control getControl() {
		 return control;
	 }
		 
	 public void setControl(Control control) {
		this.control = control;
	 }
	 
	 public int getNumTV() {
		 return numTV;
	 }
		 
	 public void setNumTV(int num) {
		numTV = num;
	 }
	 
	 public boolean getEstado(){
		 return estado;
	 }
	 
	 public void turnOn() {
			estado = true;
	}
		
	 public void turnOff() {
			estado = false;
	}
	 
	 public void canalUp (){
		 if (this.canal < 120 && this.estado == true ) {
			this.canal++; 
		 }
	 }
	 
	 public void canalDown (){
		 if (this.canal > 0 && this.estado == true ) {
				this.canal--; 
			 }
	 }
	 
	 public void volumenUp (){
		 if (this.volumen < 7 && this.estado == true ) {
				this.volumen++; 
			 }
	 }
	 
	 public void volumenDown() {
		 if (this.volumen > 0 && this.estado == true ) {
				this.volumen--; 
			 }
	 }
	 
}
