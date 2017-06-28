import java.util.regex.Pattern

def call() {
def portsInUseOnServer = {
def cmd = """Invoke-Command `
-ComputerName ${SERVER} `
-ScriptBlock { `
Import-Module WebAdministration; `
Get-WebBinding | Select bindingInformation `
}"""

def output = cmd //powershell([script: cmd, returnStdout: true])
def lines = output.split(/\n/).drop(3).dropRight(2)

Pattern pattern = Pattern.compile(/\:(.*?)\:/)
return lines.collect { pattern.matcher(it)[0][1].toInteger() }
}
portsInUseOnServer().each { println it }
}
