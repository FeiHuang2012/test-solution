# Solution Template

> This is the tide solution template.


**Note:** To support the new typescript feature of process development, your tide-cli version need to be >= **v1.33.2** and tide-process runtime >= **v4.3.0**.

## Installation

1. Download the template and rename the folder to your project.
2. Rename `gradle.properties.example` to `gradle.properties`, change the password correspondingly.
3. Rename the project name and information in `package.json`.
4. Run `yarn` to install the dev dependencies.
5. Run `tide build` to build the solution.

## Usage
1. Use Piccolo to add your models and processes. Or you can add them manually. In the later case, don't forget to update the project settings in `settings.gradle`.
2. Use `tide genStepFile` to generate BPMN tests with step files.
3. Use `tide genTaskScripts` to generate BPMN typescripts and start writing neat process code.
4. Use `tide build` to build the solution.
5. Use `tide test` to test processes defined in your step files.
6. Use `tide deploy` to deploy the solution.
