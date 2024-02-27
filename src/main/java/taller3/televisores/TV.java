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
		TV.numTV++;
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
		 this.canal = canal;
	 }
	 
	 public int getPrecio() {
		 return precio;
	 }
	 
	 public void setPrecio(int precio) {
		 this.precio = precio;
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
		 
	 public void numTV(int numTV) {
		TV.numTV = numTV;
	 }
	 
	 void turnOn (boolean True) {
		 this.estado = True;
	 }
	 
	 void turnOff (boolean False) {
		 this.estado = False;
	 }
	 
	 public boolean getEstado(){
		 return estado;
	 }
	 
	 void canalUp (boolean True){
		 if (this.canal < 120 && this.canal > 0 && this.estado == True ) {
			this.canal++; 
		 }
	 }
	 
	 void canalDown (boolean True){
		 if (this.canal < 120 && this.canal > 0 && this.estado == True ) {
				this.canal--; 
			 }
	 }
	 
	 void volumenUp (boolean True){
		 if (this.volumen < 7 && this.volumen > 0 && this.estado == True ) {
				this.volumen++; 
			 }
	 }
	 
	 void volumenDown(boolean True ) {
		 if (this.volumen < 7 && this.volumen > 0 && this.estado == True ) {
				this.volumen++; 
			 }
	 }
	 
}
