/*
This parks the robot on the line if the robot is on the left side of the field.
While testing, you will need to check the amount of time it takes for the robot to turn
and edit this by changing the TURN_TIME.
You will also need to find out the distance that the robot has to be from the line.
*/


package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous (name = "Park")
public class Park  extends LinearOpMode {
    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    public double TURN_TIME = .675;

    public void driveMethod (double rightPower, double leftPower, double seconds) {
        runtime.reset();
        while (runtime.seconds() < seconds) {
            robot.rightFrontDrive.setPower(rightPower);
            robot.leftFrontDrive.setPower(leftPower);
            robot.rightFrontDrive.setPower(rightPower);
            robot.rightFrontDrive.setPower(leftPower);
        }
    }

    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        waitForStart();

        //move forward
        driveMethod(1,1,1.5);
        //turn right
        driveMethod(-1, 1, TURN_TIME);

        //move forward onto line
        driveMethod(1,1,1);

    }
}
