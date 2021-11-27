class TestOne{

    public static void main(String[] arg) {

        int size;
		int sizeWords;
		boolean ugadal = false;
		String [] poslov = new String[3];
		String [] worlds;
		String secretWorld ="";
		String vvedSlovo = "";
		String temp ="";
		
		poslov[0] = "Под лежачий камень и вода не течет";
		poslov[1] = "Дважды в год лето не бывает";
		poslov[2] = "Застает зимушка в летнем платьице";
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		size = rand.nextInt(poslov.length);
		
		worlds = poslov[size].split(" ");
		sizeWords = rand.nextInt(worlds.length);
		
		for(int i = 0; i < worlds[sizeWords].length(); i++) {
			temp+="*";
		}
		
		secretWorld = worlds[sizeWords];
		worlds[sizeWords] = temp;
				
		
		for(int i = 0; i < worlds.length; i++) {
			
			System.out.print(worlds[i] + " ");
		}
	
		System.out.print("\n\nЧто это за слово? ");
		
		while(!ugadal) {
			vvedSlovo = sc.next();
			if(secretWorld.equals(vvedSlovo)) {
				System.out.print("Правильно!");
				ugadal = true;
			}else {
				System.out.print("Не угадал! Еще раз >");
				sc.nextLine();
				ugadal = false;
			}
		}
        
    }
}