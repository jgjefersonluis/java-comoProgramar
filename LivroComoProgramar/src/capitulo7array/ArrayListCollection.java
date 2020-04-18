package capitulo7array;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		// cria um novo ArrayList de Strings
		ArrayList<String> items = new ArrayList<String>();

		items.add("red");// acrescenta um item � lista
		items.add(0, "yellow");// insere o valor no indice 0

		// cabe�alho
		System.out.print("Display list contents with counter-controller loop:");

		// exiba as cores na lista
		for (int i = 0; i < items.size(); i++) {
			System.out.printf("%s", items.get(i));

			// exibe as cores utilizando foreach no metodo display
			display(items,
					"\nDisplay list contents with enhanced for statement: ");
			items.add("green");
			items.add("yellow");
			display(items, "List with two new elements:");

			items.remove("yellow");
			display(items, "Remove first instance of yellow: ");

			items.remove(1);
			display(items, "Remove second list element (green): ");

			// verifica se um valor esta em List
			System.out.printf("\"red\" is %sin the list\n",
					items.contains("red") ? "" : "not");

			// exibe o numero de elementos em List
			System.out.printf("Size: %s\n", items.size());
		}

	}

	public static void display(ArrayList<String> items, String header) {
		System.out.print(header);

		// exibe cada elemento nos itens
		for (String item : items) {
			System.out.printf(" %s", item);
		}

		System.out.println();// exibe o fim de linha
	}

}
