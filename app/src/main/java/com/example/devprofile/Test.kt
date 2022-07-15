package com.example.devprofile


//fun main()
//{
//   var s="aabbcccc"
//   var set=HashSet<Char>()
//   var length =0
//   var str1=""
//
//   val sArray=s.toCharArray()
//
//   var left = 0
//
//   for(right in 0 until sArray.size){
//      val current =sArray[right]
//      while(set.contains(current) && left<right)
//      {
//         set.remove(sArray[left++])
//      }
//      set.add(current)
//
//      length=Math.max(length,(right-left)+1)
//   }
//    println(length)
//    println(set)
//}


// Function to find largest sub
// string with same characters
//   fun Substring(s: String): Int {
//      var ans = 1
//      var temp = 1
//
//      // Traverse the string
//      for (i in 1 until s.length) {
//         // If character is same as
//         // previous increment temp value
//         if (s[i] == s[i - 1]) {
//            ++temp
//         } else {
//            ans = Math.max(ans, temp)
//            temp = 1
//         }
//      }
//      ans = Math.max(ans, temp)
//
//      // Return the required answer
//      return ans
//   }
//
//   // Driver code
//
//   fun main(args: Array<String>) {
//      val s = "abcdddddeffffff"
//
//      // Function call
//      println(Substring(s))
//   }

//fun main()
//{
//   var temp=1
//   var ans=1
//   var str1:String=""
//   var str2:String=""
//
//   var str="abbcccd"
//
//   for(i in 1 until str.length)
//   {
//
//      if(str[i]==str[i-1])
//      {
//         temp++
//         str1+=str[i]
//
//      }
//      else{
//
//         ans=Math.max(ans,temp)
//
//         temp=1
//      }
//
//   }
//   ans=Math.max(ans,temp)
//   println(ans)
//   println(str1)
//}


//fun main(){
//   var str="hello"
//   var str1="helpp"
//   var com=""
//
//   for(i in 0 until str.length){
//      for(j in 0 until str1.length){
//         if(str[i]==str1[j]){
//            com+=str[i]
//         }
//      }
//   }
//
//   for(i in 0 until com.length) {
//
//      println(str.replace(com, ""))
//      println(str1.replace(com, ""))
//   }
//}

// to find anagram
//put 1 string in map, then check second sting in map, if value is found remove that value till map becoms empty


//duplicate character count
//use hashmap increament repetitions of values

// isomorphic strings
// one to one mapping - map[first string char] to value of second string char
//if key is present should be equal to value of char of second string
// if value is present


//fun main(){
//    var set=HashSet<Char>()
//    set.add('a')
//    set.add('a')
//    set.add('a')
//    set.add('a')
//    set.add('a')
//    set.remove('a')
//    println(set)
//
//}

//fun main()
//{
//    var s1="hello papa"
//    var words=s1.split(" ".toRegex())
//
//    var revstr=""
//    for(word in words){
//        var revword=""
//        for(j in word.length-1 downTo 0  ){
//            revword+=word[j]+""
//        }
//        revstr=revstr+revword+" "
//    }
//
//    print(revstr)
//}

//substring with longest duplicate chars
//fun main(){
//   var str="abbccccddddd"
//   var max=0
//   var charc:Char?=null
//   var map=HashMap<Char,Int>()
//   for(c in str.toCharArray()){
//      if(map.containsKey(c)){
//         map[c]=map[c]!!+1
//      }
//      else{
//         map[c]=1
//      }
//   }
//   for(v in map.keys){
//      if(map[v]!! > max){
//        charc=v
//        max=map[v]!!
//      }
//   }
//
//   for(i in 1..max){
//      print(charc)
//   }
//
//}


//fun main(){
//   var str="aabbcccc"
//   var length=0
//   var set=HashSet<Char>()
//   var left=0
//   for(right in 1 until str.length){
//      var current=str[right]
//      while(set.contains(current)&& left<right){
//           set.remove(str[left++])
//      }
//      set.add(current)
//      length=Math.max(length,(right-left)+1)
//   }
//   println(set)
//}

//fun main(){
//   var s1="aaxxbobcecd"
//   var set=HashSet<Char>()
//   var set1=""
//   var sb=""
//   var max=0
//   var left=0
//   var length=0
//   for(right in 0 until s1.length ){
//      var current=s1[right]
//      while(set.contains(current)&&left<right){
//         sb.replace(s1[left]+"","")
//         set.remove(s1[left++])
//
//      }
//
//      set.add(current)
//      sb=sb+current
//      length=Math.max(length,(right-left)+1)
//      if(length>max){
//         max=length
//         set1=""
//         set1=set.toString()
//      }
//
//   }
//   println(set1)
//   println(length)
//}

//open class Animal
//{
//    var abc="blend"
//    fun go(){
//        println("animal")
//    }
//}
//
//class Dog:Animal(){
//
//}

//fun main(){
//    var n=10
//    var t1=0
//    var t2=1
//
//    for(i in 1..n){
//        print("$t1 ")
//        var sum=t1+t2
//        t1=t2
//        t2=sum
//    }
//
//}


//    fun main() {
//        val sample = "krishna64"
//        val chars = sample.toCharArray()
//        val sb = StringBuilder()
//        for (c in chars) {
//            if (Character.isDigit(c)) {
//                sb.append(c)
//            }
//        }
//        println(sb)
//    }

//fun main(){
//    var n=5
//    for(i in 1..5){
//        for(j in 1..i){
//            print("*")
//        }
//        println("")
//    }
//}


//fun main() {
//    val a: String
//    var b = ""
//    val s = Scanner(System.`in`)
//    print("Enter the string you want to check:")
//    a = s.nextLine()
//    val n = a.length
//    for (i in n - 1 downTo 0) {
//        b = b + a[i]
//    }
//    if (a.equals(b, ignoreCase = true)) {
//        println("The string is palindrome.")
//    } else {
//        println("The string is not palindrome.")
//    }
//}
//String pallin
//fun main(){
//    var str="aba"
//    var s2=""
//    for(c in str.length-1 downTo 0){
//        s2=s2+str[c]
//    }
//    if(s2.equals(str)){
//        println("pallin")
//    }
//    else{
//        println("not pallin")
//    }
//}

//Integer pallin
//fun main(){
//    var num=123
//    var temp=num
//    var r=0
//    var sum=0
//    while(temp>0){
//        r=temp%10
//        sum=sum*10+r
//        temp=temp/10
//    }
//    println("$sum")
//    if(sum==num){
//        println("pallin")
//    }
//    else{
//        println("not pallin")
//    }
//}

//    fun main() {
//        val sample = "krishna64"
//        println(findNumber(sample))
//    }
//
//fun findNumber(sample:String):String{
//    val chars = sample.toCharArray()
//    val sb = StringBuilder()
//    for (c in chars) {
//        if (Character.isDigit(c)) {
//            sb.append(c)
//        }
//    }
//    return sb.toString()
//}


//fun main(){
//    var n=10
//   var alist= fibo(n)
//    for(list in alist){
//        println(list)
//    }
//
//}
//
//fun fibo(n:Int):List<Int>{
//    var t1=0
//    var t2=1
//    var list= mutableListOf<Int>()
//    for(i in 1..n){
//        list.add(t1)
//        //print("$t1 ")
//        var sum=t1+t2
//        t1=t2
//        t2=sum
//    }
//    return list
//}

//fun star(n:Int){
//    for(i in 1..n){
//        for(j in 1..i){
//            print("*")
//        }
//        println("")
//    }
//}


// Extention and Infix
//fun main(){
//
//    var s1="hi"
//    var s2="hello"
//    var s3="bye"
//
//    var test= Test()
//    println("Student is Topper = "+test.goto(95))
//    var res= test goto 35
//    println("Infix result = "+res)
//    println("Combined String = "+s1.add(s2,s3))
//
//
//}
//
//
//
//infix fun Test.goto(marks:Int): Boolean {
//    return marks>90
//}
//
//fun String.add(s1:String,s2:String): String {
//    return this+s1+s2
//}
//
//class Test{
//
//}


//data class User(var name:String, var id:Int){
//
//    fun getUserName() = "$name"
//
//}
//
//fun main(){
//    var user1=User("Shivi",1)
//    println(user1) // similar to user1.toString()
//
//    var user2=user1.copy(name = "Ganesh") // copy()
//    println("user2= $user2")
//
//    println(user1.equals(user2)) // equals()
//
//    println(user1.getUserName())
//
//    println(user1.component1())
//    println(user1.component2()) // component()
//
//    val (name, id) =user1 // destructuring
//
//    println("$name   $id")
//
//    println(user2.hashCode())
//
//
//
//
//}


//fun main() {
//
//    var person:String?=null
//    var length=person?.let{
//        it.length
//    }
//
//    var length1=person?.run{
//        this.toString()
//    }
//
//    println(length)
//    println(length1)
//
//}

//data class User(var id: Int, var name: String, var email: String) {
//
//}
//
//fun main() {
//    var getObj = getUser()
//
//
//    var searchByName: List<User>? = searchByNames("A", getObj)
//    var searchByemail= searchByemails("livelike",getObj)
//    var getAllIds= getAllIdslist(getObj)
//
//
//    println("********* Search By Name *********")
//    searchByName?.forEach {
//
//        println(it)
//    }
//    println()
//    println("********* Search By Email *********")
//
//    searchByemail?.forEach {
//
//        println(it)
//    }
//
//    println()
//    println("********* Get All IDs *********")
//
//    getAllIds?.forEach {
//
//        println(it)
//    }
//}
//
//fun getAllIdslist(obj: MutableList<User>): MutableList<Int>? {
//
//    var idsList:MutableList<Int> = obj.map { it.id } as MutableList<Int>
//    return idsList
//
//}
//
//fun searchByemails(s: String, obj: MutableList<User>): MutableList<User>? {
//    var listuser: MutableList<User>? = mutableListOf<User>()
//
//    obj.forEach {
//
//        if (it.email.endsWith(s, true)) {
//
//            listuser?.add(it)
//        }
//        else if (it.email.startsWith(s, true)) {
//
//            listuser?.add(it)
//        }
//        else if (it.email.contains(s, true)) {
//
//            listuser?.add(it)
//        }
//
//
//    }
//
//
//    return listuser
//}
//
//
//
//
//fun searchByNames(sa: String, obj: MutableList<User>): List<User> =  obj.filter { it.name.startsWith(sa,true) }
//
//fun getUser(): MutableList<User> {
//    return mutableListOf(
//        User(123, "abc", "ravi@gmail.com"),
//        User(678, "nabc", "vicky@livelike.com"),
//        User(78, "mnabc", "data@hotmail.com"),
//        User(79, "smnabc", "modata@gmail.com"),
//        User(79, "akbc", "modata@gmail.com")
//
//
//    )
//}


//sealed class Test{
//    data class cdata(var name:String):Test()
//    class sdata(var name:String):Test()
//    object noShape:Test()
//}
//
//fun main(){
//    var circle=Test.cdata("circle")
//    var square=Test.sdata("")
//}


//fun subString(input: String): String {
//
//    val set = HashSet<Char>()
//
//    var longestOverAll = ""
//    var longestTillNow = ""
//
//    for (i in 0 until input.length) {
//        val c = input[i]
//
//        if (set.contains(c)) {
//            longestTillNow = ""
//            set.clear()
//        }
//        longestTillNow += c
//        set.add(c)
//        if (longestTillNow.length > longestOverAll.length) {
//            longestOverAll = longestTillNow
//        }
//    }
//
//    return longestOverAll
//}
//
//fun main() {
//    val input = "substringfindout"
//    println(subString(input))
//}

//fun getUniqueCharacterSubstring(input: String): String? {
//    val visited: MutableMap<Char, Int> = HashMap()
//    var output = ""
//    var start = 0
//    var end = 0
//    while (end < input.length) {
//        val currChar = input[end]
//        if (visited.containsKey(currChar)) {
//            start = Math.max(visited[currChar]!! + 1, start)
//        }
//
//        if (output.length < end - start + 1) {
//            output = input.substring(start, end + 1)
//
//        }
//        visited[currChar] = end
//
//        end++
//    }
//    return output
//}
//
//fun main(){
//    println(dups("aaabc"))
//}
//
//


//fun main(args: Array<String>) {
//    val rows = 5
//    var k = 0
//
//    for (i in 1..rows) {
//        for (space in 1..rows - i) {
//            print("  ")
//        }
//
//        while (k != 2 * i - 1) {
//            print("* ")
//            ++k
//        }
//
//        println()
//        k = 0
//    }
//}

//fun main(){
//    var k=0
//    var n=5
//    for(i in 1..n) {
//        for (space in 1..n - i) {
//            print(" ")
//        }
//
//
//        while (k != 2 * i - 1)
//        {
//            print("*")
//            k++
//        }
//        println()
//        k=0
//    }
//}

//fun dups(input:String): String {
//    var end=0
//    var start=0
//    var output=""
//    var map=HashMap<Char,Int>()
//    while(end<input.length){
//        var cur=input[end]
//        if(map.containsKey(cur)){
//            start=Math.max(map[cur]!!+1,start)
//        }
//
//        if(output.length<end-start+1){
//            output=input.substring(start,end+1)
//        }
//
//        map[cur]=end
//        end++
//
//    }
//    return output
//}










