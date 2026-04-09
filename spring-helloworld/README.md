# spring-helloworld

Spring Boot の HelloWorld サンプルアプリ。  
`localhost:8080` でページを表示し、Java から渡した "Hello, World!" の文字とランダムなサイコロ（⚀〜⚅）を Thymeleaf テンプレートで描画します。

## 構成

```sh
spring-helloworld/
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
cd spring-helloworld
mvn spring-boot:run
```

起動後、ブラウザで以下の URL を開きます。

<http://localhost:8080/>

"Hello, World!" とランダムなサイコロが表示されます。  
ページをリロードするたびにサイコロの目が変わります。

## テストの実行

```sh
cd spring-helloworld
mvn test
```

期待される出力:

```text
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 停止方法

ターミナルで `Ctrl + C` を押してサーバを停止します。
