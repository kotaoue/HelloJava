# play-helloworld

Play Framework の HelloWorld サンプルアプリ。  
`localhost:9000` でページを表示し、Java から渡した "Hello, World!" の文字とランダムなサイコロ（⚀〜⚅）を Twirl テンプレートで描画します。

## 構成

```sh
play-helloworld/
├── build.sbt                       # SBT ビルド設定
├── project/
│   ├── build.properties            # SBT バージョン
│   └── plugins.sbt                 # Play SBT プラグイン
├── conf/
│   ├── application.conf            # アプリケーション設定
│   └── routes                      # ルーティング設定
├── app/
│   ├── controllers/
│   │   └── HomeController.java     # GET / を処理するコントローラ
│   └── views/
│       └── index.scala.html        # Twirl テンプレート
├── public/
│   └── stylesheets/
│       └── main.css                # スタイルシート
└── test/
    └── controllers/
        └── HomeControllerTest.java # 統合テスト
```

## 事前準備

| ツール | 推奨バージョン |
| ------ | -------------- |
| JDK    | 17 以上        |
| SBT    | 1.9 以上       |

### SBT のインストール

macOS (Homebrew):

```sh
brew install sbt
```

その他の OS は [SBT 公式サイト](https://www.scala-sbt.org/download.html) を参照してください。

バージョン確認:

```sh
java -version
sbt --version
```

## 起動方法

```sh
cd play-helloworld
sbt run
```

起動後、ブラウザで以下の URL を開きます。

<http://localhost:9000/>

"Hello, World!" とランダムなサイコロが表示されます。  
ページをリロードするたびにサイコロの目が変わります。

## テストの実行

```sh
cd play-helloworld
sbt test
```

期待される出力:

```text
[info] Tests: succeeded 3, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
```

## 停止方法

ターミナルで `Ctrl + D` を押してサーバを停止します。
