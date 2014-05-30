(function () {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    fi: Kotlin.definePackage(null, /** @lends _.fi */ {
      ilariel: Kotlin.definePackage(null, /** @lends _.fi.ilariel */ {
        unicodejs: Kotlin.definePackage(function () {
          this.ViewportRendererConst = Kotlin.createObject(null, function () {
            this.webgl = 'webgl';
            this.canvas = 'canvas';
            this.dom = 'dom';
            this.auto = 'auto';
          });
        }, /** @lends _.fi.ilariel.unicodejs */ {
        })
      })
    })
  });
  Kotlin.defineModule('UnicodetilesJSKotlin', _);
}());
