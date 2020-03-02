/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.ArmDown;
import frc.robot.commands.ArmOff;
import frc.robot.commands.ArmUp;
//import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.DriveCommand;
import frc.robot.subsystems.Arm;
//import frc.robot.commands.Piloter;
import frc.robot.subsystems.BasePilotable;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {


//Étape 10 Déclaration de tous les sous-systèmes, ici on déclare le sous-système BasePilotable
// Déclaration de la Manette de jeu 
private final BasePilotable m_basePilotable = new BasePilotable(); 
private final Joystick m_stick = new Joystick(0);

private final Arm m_armSubsystem = new Arm();

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */

   //Étape 11 -- Déclaration des Commandes par défaut- ici on appelle la commande basePilotable
  public RobotContainer() {

    // Configure the button bindings
    configureButtonBindings();

    // Commandes par défaut 
    m_basePilotable.setDefaultCommand(new DriveCommand(()->m_stick.getY(), ()->m_stick.getX(), m_basePilotable));
    m_armSubsystem.setDefaultCommand(new ArmUp(m_armSubsystem));
     }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {


    new JoystickButton(m_stick, JoystickButtonConstants.kL3)
    .whenPressed(new ArmUp(m_armSubsystem));

    JoystickButton armUpButton = new JoystickButton(m_stick, JoystickButtonConstants.kL3);
    armUpButton.whileHeld(new ArmUp(m_armSubsystem));

    new JoystickButton(m_stick, 3).whenPressed(new ArmUp(m_armSubsystem));

    new JoystickButton(m_stick,JoystickButtonConstants.kL3).whileHeld(new ArmUp(m_armSubsystem));

  new JoystickButton(m_stick, JoystickButtonConstants.kR3).whenPressed(new ArmDown(m_armSubsystem));

  new JoystickButton(m_stick, JoystickButtonConstants.kL3).whenPressed(new ArmOff(m_armSubsystem));
    




  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * 
   */
  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
  //  return m_autoCommand;
 // }
}
