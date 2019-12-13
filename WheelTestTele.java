package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class WheelTestTele extends LinearOpMode {
HardwarePushbot robot = new HardwarePushbot();
    private ElapsedTime runtime = new ElapsedTime();




    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        runtime.reset();
        while(opModeIsActive()) {

            robot.init(hardwareMap);

            if (gamepad1.a) {
                robot.leftFrontDrive.setPower(1);
            }
            if (gamepad1.b) {
                robot.rightBackDrive.setPower(1);
            }
            if (gamepad1.x) {
                robot.rightFrontDrive.setPower(1);
            }
            if (gamepad1.y) {
                robot.leftBackDrive.setPower(1);
            }
        }
    }
}
