//foundation on left side of robot, end position: on line near wall
//Does: moves foundation
package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name = "DriveTrainAuton")
public class DriveTrainAuton1 extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();



    //Drive forwards for seconds
    public void driveStraight(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds){
            robot.leftBackDrive.setPower(1);
            robot.rightBackDrive.setPower(1);
            robot.leftFrontDrive.setPower(1);
            robot.rightFrontDrive.setPower(1);
        }
    }
    //Drive backwards for seconds
    public void driveBack(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds) {
            robot.leftBackDrive.setPower(-1);
            robot.rightBackDrive.setPower(-1);
            robot.leftFrontDrive.setPower(-1);
            robot.rightFrontDrive.setPower(-1);
        }
    }

    //Strafe right for seconds
    public void strafeRight(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds) {
            robot.leftBackDrive.setPower(1);
            robot.rightBackDrive.setPower(1);
            robot.leftFrontDrive.setPower(-1);
            robot.rightFrontDrive.setPower(-1);
        }
    }

    //strafe left for seconds
    public void strafeLeft(double seconds) {
        runtime.reset();
        while(runtime.seconds() < seconds) {
            robot.leftBackDrive.setPower(-1);
            robot.rightBackDrive.setPower(-1);
            robot.leftFrontDrive.setPower(1);
            robot.rightFrontDrive.setPower(1);
        }
    }

    //Drive method for other things that were not specified above
    public void driveMethod(double lp, double rp, double seconds) {
        runtime.reset();
        while (runtime.seconds() < seconds) {
            robot.rightBackDrive.setPower(rp);
            robot.rightFrontDrive.setPower(rp);
            robot.rightBackDrive.setPower(lp);
            robot.leftBackDrive.setPower(rp);
        }
    }

    //Sets servos on back of robot
    public void pullSystem(int mode) {
        //0 is the default (up position)
        if (mode == 1) {
            robot.rightPullSystem.setPosition(1);
            robot.leftPullSystem.setPosition(1);
        } else {
            robot.rightPullSystem.setPosition(0);
            robot.leftPullSystem.setPosition(0);
        }
    }

    @Override
    public void runOpMode() throws InterruptedException {


        robot.init(hardwareMap);
        driveStraight(.5);
        strafeLeft(1);
        pullSystem(1);
        driveStraight(.25);
        pullSystem(0);
        strafeRight(.25);
        driveBack(.5);
        strafeRight(1);

    }
}
