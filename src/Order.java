

	public class Order {
		String item;
		double price;
		String size;
		String customerID, customerID2;
		

		public  String getItem() {
			return item;
		}


		public void setItem(String item) {
			this.item = item;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double d) {
			this.price = d;
		}


		public String getSize() {
			return size;
		}


		public void setSize(String size) {
			this.size = size;
		}


		public Order() {
			// TODO Auto-generated constructor stub
			
			price=0;
			size = "";
			item ="";
		}

	}


