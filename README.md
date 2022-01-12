# DesafioPubFuture
Softwares necessários para aplicação do programa:

JDK 17;
Apache NetBeans;
MySql Community

Instale o JDK 17 e o Apache NetBeans;

Instale o MySQL Community, vá em "ADD", selecione os programas "MySQL Server", "MySQLWorkbench" e "Connector/J".

**Configuração MySQL Server**: Config Type - Development Computer.  TCP/IP. Port:**3306**.  XProtocol Port:33060.
Habilite a opção "Use strong password", após crie uma senha forte, que será utilizada para acesso ao servidor.
Vá em "ADD USER". Adicione o User Name "**publica**", Host: <All Hosts (%)>, Role: DB Admin. E deixe as senhas em **branco**.
Vá em Next e Execute, após então vá em Finish.

Faça download dos arquivos presentes no repositório do GitHub;
Faça a extração dos arquivos dentro da sua pasta de projetos;

**MySQL Workbench**
Abra o programa MySQL Workbench, abra a conexão "Local", inserindo a senha forte que você adicionou anteriormente.
Após aberto, vá na aba "Server" - "Data import" (Onde você fará a importação da base de dados com as colunas necessárias.)
Selecione a opção "Import from self-contained file" e escolha o arquivo desafiopubfuture.sql que foi baixado através do repositório do GitHub.
Clique em "Load Folder Contents", então vá para a aba "Import Progress" e clique em "Start Import".
Após você pode atualizar sua pasta "Schemas" e irá visualizar a base de dados "desafiopubfutureder".


No NetBeans, vá em File - Open Project, e selecione a pasta "DesafioPubFuture-main", que estará localizada na sua pasta de projetos;

Adicione os arquivos presentes no repositório: jar hamcrest 1.2, hamcrest 1.3, jcalendar 1.4 e mysql-connector-java-8.0.27 na biblioteca do seu projeto.

Execute a classe menuInicialVIEW, e navegue através das janelas para experenciar as diversas ferramentas do sistema.
