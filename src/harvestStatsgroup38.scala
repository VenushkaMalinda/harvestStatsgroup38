object harvestStatsgroup38 extends App {
  var detailarr = Array.ofDim[Int](4,7)
  var maxI = 0
  var maxJ = 0
  var minI = 0
  var minJ = 0
  var tot = 0
  var count = 0
  detailarr(0)(0) = 10
  detailarr(0)(1) = 20
  detailarr(0)(2) = 30
  detailarr(0)(3) = 40
  detailarr(0)(4) = 50
  detailarr(0)(5) = 60
  detailarr(0)(6) = 70
  detailarr(1)(0) = 110
  detailarr(1)(1) = 120
  detailarr(1)(2) = 130
  detailarr(1)(3) = 140
  detailarr(1)(4) = 150
  detailarr(1)(5) = 150
  detailarr(1)(6) = 160
  detailarr(2)(0) = 1400
  detailarr(2)(1) = 200
  detailarr(2)(2) = 220
  detailarr(2)(3) = 195
  detailarr(2)(4) = 182
  detailarr(2)(5) = 320
  detailarr(2)(6) = 220
  detailarr(3)(0) = 20
  detailarr(3)(1) = 195
  detailarr(3)(2) = 310
  detailarr(3)(3) = 400
  detailarr(3)(4) = 100
  detailarr(3)(5) = 90
  detailarr(3)(6) = 80

  var max = detailarr(0)(0)
  var min = detailarr(0)(0)

  for(i<-0 to 3){
    for(j<-0 to 6){
      tot+=detailarr(i)(j)
      if(detailarr(i)(j)>max){
        max=detailarr(i)(j)
        maxI = i
        maxJ = j
      }
      if(detailarr(i)(j)<min){
        min=detailarr(i)(j)
        minI = i
        minJ = j
      }
      count=count+1
    }
  }

  print("The maximum harvest is "+max+" kilograms and it occurs in day "+maxJ+" of week "+maxI)
  print(".\n")
  print("The minimum harvest is : "+min+" kilograms and it occurs in day "+minJ+" of week "+minI)
  print(".\n")
  var range = max - min
  print("The range is : "+range)
  print(".\n")
  var avg = tot/count
  print("The average is : "+avg)
  print(".\n")
}
