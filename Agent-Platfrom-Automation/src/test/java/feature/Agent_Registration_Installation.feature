#Author: shivendra


Feature: Validate Registration, Re-registration, installation and uninstallation of Agent on Windows, Linux, MAC 
  

  Scenario: Verify Agent is installated and registered successfully on Linux
    Given Linux agent present on the machine
    When User install agent on machine
    Then Agent install successfully on the machine
    And Agent creates appropriate directory structure
