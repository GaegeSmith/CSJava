$count = [int]0
[int]$numOfNums = Read-Host "How many numbers are you going to add"
while ($count -lt $numOfNums) {
    $count = $count + [int]1
    Write-Host $count
    
}
