package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp (name = "DriveTrainTele")
public class DriveTrainTele extends LinearOpMode {



    HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();

    public void driveMethod () {
        
    }

    private double THRESHOLD = .3;

    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);


        waitForStart();


        while(opModeIsActive()) {
            //if the gamepad joysticks are used, set wheel power to that. Otherwise, if the a,b,x,or y buttons are used, move accordingly. Else, set wheel power to 0.

            if (gamepad1.right_stick_y>THRESHOLD || gamepad1.right_stick_y < -THRESHOLD || gamepad1.left_stick_y>THRESHOLD || gamepad1.right_stick_y< -THRESHOLD) {

                robot.leftBackDrive.setPower(gamepad1.left_stick_y);
                robot.rightBackDrive.setPower(gamepad1.right_stick_y);
                robot.leftFrontDrive.setPower(gamepad1.left_stick_y);
                robot.rightFrontDrive.setPower(gamepad1.right_stick_y);
            } else if (gamepad1.b) {
                robot.leftBackDrive.setPower(1);
                robot.leftFrontDrive.setPower(1);
                robot.rightFrontDrive.setPower(1);
                robot.rightBackDrive.setPower(1);
                telemetry.addData("Status: ", "moveForward");
            } else if (gamepad1.a) {
                robot.leftBackDrive.setPower(-1);
                robot.leftFrontDrive.setPower(-1);
                robot.rightFrontDrive.setPower(-1);
                robot.rightBackDrive.setPower(-1);
                telemetry.addData("Status: ", "moveBack");
            } else if (gamepad1.x) {
                robot.leftFrontDrive.setPower(1);
                robot.rightFrontDrive.setPower(1);
                robot.leftBackDrive.setPower(-1);
                robot.rightBackDrive.setPower(-1);
                telemetry.addData("Status: ", "strafeRight");
            } else if (gamepad1.y) {
                robot.leftFrontDrive.setPower(-1);
                robot.rightFrontDrive.setPower(-1);
                robot.rightBackDrive.setPower(1);
                robot.leftBackDrive.setPower(1);

                telemetry.addData("Status: ", "strafeLeft");
            } else {
                robot.leftBackDrive.setPower(0);
                robot.rightBackDrive.setPower(0);
                robot.leftFrontDrive.setPower(0);
                robot.rightBackDrive.setPower(0);
            }
        }

    }
}
