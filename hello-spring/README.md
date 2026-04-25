# hello-spring

Spring Boot の HelloWorld サンプルアプリ。  
`localhost:8080` でページを表示し、Java から渡した "Hello, World!" の文字とランダムなサイコロ（⚀〜⚅）を Thymeleaf テンプレートで描画します。

## Features

* **Auto-configuration** — Automatically configures Spring components based on classpath dependencies
* **Embedded server** — Ships with an embedded Tomcat server; run the app as a plain JAR
* **Dependency injection** — Built-in IoC container manages component lifecycles via annotations
* **Thymeleaf integration** — Natural HTML templates processed server-side with full Spring expression support
* **Opinionated defaults** — Production-ready configuration with sensible out-of-the-box settings
* **Extensive ecosystem** — Access to the full Spring ecosystem (Security, Data, Cloud, Actuator, etc.)

## 構成

```sh
hello-spring/
├── pom.xml
└── src/
    ├── main/
    │   ├── java/com/example/
    │   │   ├── HelloApplication.java   # Spring Boot エントリポイント
    │   │   └── HelloController.java    # GET / を処理するコントローラ
    │   └── resources/
    │       ├── application.properties  # サーバポート設定 (8080)
    │       ├── templates/
    │       │   └── index.html          # Thymeleaf テンプレート
    │       └── static/css/
    │           └── style.css           # スタイルシート
    └── test/java/com/example/
        └── HelloControllerTest.java    # MockMvc を使った結合テスト
```

## 事前準備

| ツール | 推奨バージョン |
| ------ | -------------- |
| JDK    | 17 以上        |
| Maven  | 3.6 以上       |

バージョン確認:

```sh
java -version
mvn -version
```

## 起動方法

```sh
cd hello-spring
mvn spring-boot:run
```

起動後、ブラウザで以下の URL を開きます。

<http://localhost:8080/>

"Hello, World!" とランダムなサイコロが表示されます。  
ページをリロードするたびにサイコロの目が変わります。

## テストの実行

```sh
cd hello-spring
mvn test
```

期待される出力:

```text
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 停止方法

ターミナルで `Ctrl + C` を押してサーバを停止します。
