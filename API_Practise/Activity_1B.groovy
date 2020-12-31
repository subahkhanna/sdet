package API_Practise

class Activity_1B {

	public static void main(def arg) {
		
		File file = new File("src/input.txt");
		file.createNewFile();
		def inputtext = "A quick brown fox jumped over the lazy cow\nJohn jimbo jingeled happily ever after\nThi\$ 1\$ v3\$ry c\$0nfus\$1ng"
		file.write(inputtext);
		
		//Match Operations
		file.eachLine { line ->
			if(line==~/^A.*Cow$/)
			{
				println"Line that ends with Cow is: $line"
			 }
		}
		
		// Line that starts with letter J
		file.eachLine { line ->
			if(line==~/^J.*$/)
			{
				println"Line that starts with letter J is: $line"
			 }
		}
		// line that has two numbers one after another
		file.eachLine { line ->
			if(line==~ /.*\d\d.*/)
			{
				println"Line that has two adjacent numbers: $line"
			 }
		}
		
		// Print the Strings that match the pattern
		println "\n\nFind Operations: /S+er/ "
		def match1 = file.getText() =~ /\S+er/
		println "String(s) matching are :" ${match1.findAll()}
		
		println "\n\nFind Operations: S*d W "
		def match2 = file.getText() =~ /\S*\d\W/
		println "String(s) matching are :" ${match2.findAll()}
		
	}
}
