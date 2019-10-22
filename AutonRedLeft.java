package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name = "AutoRedLeft", group = "Pushbot")
public class AutonRedLeft extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    public void driveMethod(double rightSpeed, double leftSpeed, double secs) {
        // The motors are being set to a speed given within the parameters
        runtime.reset();
        while (runtime.seconds() < secs) {
            robot.rightFrontDrive.setPower(rightSpeed);
            robot.rightBackDrive.setPower(rightSpeed);
            robot.leftFrontDrive.setPower(leftSpeed);
            robot.leftBackDrive.setPower(leftSpeed);
        }

    }

    public void pullSystem(double position) {
        robot.rightPullSystem.setPosition(position);
        robot.leftPullSystem.setPosition(position);

    }


    public void turnLeft() {
        driveMethod(1,-1, .565);
    }

    public void turnRight() {
        driveMethod(-1,1,.565);
    }
    public void doNothing(double secs) {
        driveMethod(0,0,secs);

    }

    @Override
    public void runOpMode() {
        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        
        // Wait for two seconds before starting
        doNothing(2);
        
        
        //Move to foundation and latch on (approx 5 secs)
        driveMethod(1,1,1.2);
        turnRight();
        driveMethod(1,1,2.6);
        turnLeft();
        pullSystem(1);



        //move back to triangle (approx 4.75 secs)
        driveMethod(-1,-1,1.6);
        pullSystem(0);
        turnLeft();
        driveMethod(1,1,2.4);

        //cross to loading zone under neutral bridge (approx. 7.3 secs)
        turnRight();
        driveMethod(1,1,3.6);
        turnLeft();
        driveMethod(1,1,2.4);


        //Bring the first skystone into the building area (approx 5.25 secs)
        turnLeft();
        driveMethod(1,1,1.6);
        turnLeft();
        driveMethod(1,1,2.4);


        //Move back to loading area (approx 9 secs)
        turnLeft();
        driveMethod(1,1,2.4);
        turnLeft();
        driveMethod(1,1,4.8);
        turnLeft();

        //Move to building area (approx 5.365 secs)
        driveMethod(1,1,1.2);
        turnLeft();
        driveMethod(1,1,3.6);

        //park on line (approx .6 secs)
        driveMethod(-1,1,.6);
    }
}


