package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produtos;
import servicos.CalcularServico;

public class Program {

	public static void main(String[] args) {
		
		List<Produtos> list = new ArrayList<>();
		
		String path ="src\\texto\\texto.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line =br.readLine();
			while(line!=null) {
				String[] recortandoNomePrecoCsv = line.split(",");
				list.add( new Produtos(recortandoNomePrecoCsv[0], Double.parseDouble(recortandoNomePrecoCsv[1])));
				line = br.readLine();
			}
			
			
			Produtos x = CalcularServico.max(list);
			System.out.println("Mais caro: "+x);
			
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
