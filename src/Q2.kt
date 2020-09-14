//// Find highest number from array

fun main(){
    val nums = arrayOf(1,2,3,4,5)
    var largest = nums[0]

    for(num in nums){
        if(largest<num){
            largest = num
        }
    }
    println("The largest number = $largest")
}
