# Eclipse19-20


Code for autonomous and teleop phases of FTC Skystone 2019 for Alpharetta Robotics Eclipse. 

10.22.19

For testing the code:
test AutonBlueRight, AutonBlueLeft, AutonRedRight, and AutonRedLeft.
Please test the timing of the commands (those can be edited through the last parameter of each command)
and the timing of the turn left and right (those can be edited through changing the last parameter of the driveMethod 
under the turnRight and turnLeft methods).

DoNothing method:
after the driver presses play, the robot does nothing for two seconds. This can be changed (edit secs value when the function is called) if the robot goes over 30 seconds, but keep it at least one second. 



Robot Info:
Auton Modes:
DriveTrainAuton1:
Start position: left side of line
end position: on line near wall
Does: moves foundation

DriveTrainAuton2:
Start Position: left side of line
end position: on line near center bridge
Does: moves foundation

DriveTrainAuton3:
Start Position: right side of line
End position: on line near wall
Does: moves foundation


DriveTrainAuton4:
Start Position: right side of line
End position: on line near center bridge
Does: moves foundation


DriveTrainAutonPark1:
Start Position: left side of line
End Position: line near wall
Does: parks

DriveTrainAutonPark2:
Start Position: left side of line
End Position: line near central bridge
Does: Parks

DriveTrainAutonPark3:
Start Position: right side of line
End Position: line near wall
Does: Parks

DriveTrainAutonPark4:
Start Position: right side of line
End Position: line near center bridge
Does: parks

Configuration:

DC Motors
leftFrontDrive: lfd
rightFrontDrive: rfd
leftBackDrive: lbd
rightBackDrive: rbd

leftIntake (front): lIntake
rightIntake (front): rIntake
leftBackIntake: lbi
rightBackIntake: rbi

Sevos
leftPullSystem: lps
rightPullSystem: rps
