package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "task1 ")
public class task1 extends LinearOpMode {
    private DcMotor motor1;
    private DcMotor motor2;
    private DcMotor motor3;
    private DcMotor motor4;
    @Override
    public void runOpMode() {
        motor1 = hardwareMap.get(DcMotor.class, "motor1");
        motor2 = hardwareMap.get(DcMotor.class, "motor2");
        motor3 = hardwareMap.get(DcMotor.class, "motor1");
        motor4 = hardwareMap.get(DcMotor.class, "motor2");
        motor2.setDirection(DcMotor.Direction.REVERSE);
        motor1.setDirection(DcMotor.Direction.FORWARD);
        waitForStart();
        if (opModeIsActive()) {
            while (opModeIsActive()) {
                motor1.setPower(-gamepad1.right_stick_y);
                motor2.setPower(-gamepad1.right_stick_y);
                motor1.setPower(-gamepad1.left_stick_x);
                motor2.setPower(gamepad1.left_stick_x);
                if(gamepad1.a){
                    motor3.setPower(1);
                }
                if(gamepad1.b){
                    motor3.setPower(0);
                }
                if(gamepad1.x){
                    motor4.setPower(1);
                }
                if(gamepad1.y){
                    motor4.setPower(0);
                }

            }
        }
    }
}


