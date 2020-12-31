package API_Practise

class Activity_1 {

	public static void main(def args) {
	def x
	boolean y
	//Array
	def inputlist= [11,2,19,5,"Mango","Apple","Watermelon"]
	def strList = inputlist.minus([11,2,19,5])
	def intList = inputlist.minus(["Mango","Apple","Watermelon"])
	//print list
	println "Sorted String List" + strList.sort()
	println "Sorted Integer List" + intList.sort()
	}
}
