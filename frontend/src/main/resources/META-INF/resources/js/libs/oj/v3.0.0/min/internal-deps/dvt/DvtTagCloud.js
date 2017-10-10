/**
 * Copyright (c) 2014, 2016, Oracle and/or its affiliates.
 * The Universal Permissive License (UPL), Version 1.0
 */
"use strict";
define(['./DvtToolkit'], function(dvt) {
  // Internal use only.  All APIs and functionality are subject to change at any time.

var ga;function ka(a,E){0==a.indexOf("dvt.")&&(a=a.substring(4));var B=a.split("."),q=eval("dvt");B[0]in q||!q.execScript||q.execScript("var "+B[0]);for(var w;B.length&&(w=B.shift());)B.length||void 0===E?q=q[w]?q[w]:q[w]={}:q[w]=E}Math.floor(2147483648*Math.random()).toString(36);
(function(a){function E(a){this.Init(a)}function B(a,b,d,f){this.Init(b,d,f);this.La=a}function q(){}function w(){this.Init({alta:w.Hg})}function x(a,b,d){this.Init(a,b,d)}function h(a,b,d,f,h,l,y,t,q){this.Init(a,b,d,f,h,l,y,t,q)}function b(a){this.dE=a}a.Vh=function(a,b,d){this.Init(a,b,d)};a.i.v(a.Vh,a.lc);a.Vh.newInstance=function(b,d,f){return new a.Vh(b,d,f)};a.Vh.prototype.Init=function(b,d,f){a.Vh.C.Init.call(this,b,d,f);this.a.Hc.pa().setAttributeNS(null,"text-rendering","geometricPrecision");
this.u=new B(this,b,this.Kf,this);this.u.Jf(this);a.m.mb()||this.u.ss(new E(this.u));this.Uf=new w;this.Ub=[];this.$v=[];this.jk=null;this.Yo=new a.Ec(this.a);this.u.AS(this.Yo)};a.Vh.prototype.ha=function(b,d,g){isNaN(d)||isNaN(g)||(this.Ra=d,this.eb=g);this.QZ();this.Ke(b);this.po();this.Wi=this.Ha;this.BH=this.Ub;this.Ub=[];this.DEa=[];this.Ha=new a.ba(this.a);this.B(this.Ha);f.ha(this,this.Ha,new a.U(0,0,this.Ra,this.eb));this.Kb&&this.Kb.ms(this.K.selection,this.pw());d=this.K.animationDuration;
g=new a.U(0,0,this.Ra,this.eb);this.Wi?"none"!==this.K.animationOnDataChange&&b&&(this.xh=new a.ba(this.a),this.B(this.xh),b=new a.dm(this.a,this.xh),b.Zn(this.BH,this.Ub),this.Ab=b.hw()):"none"!==this.K.animationOnDisplay&&(this.Ab=a.Ta.rE(this.a,a.Ta.sA,this.Ha,g,d));this.Ab?(this.u.cd(),this.u.Gm(this),this.Ab.dg(this.fza,this),this.Ab.play()):this.fza();this.Hs()};a.Vh.prototype.Mva=function(a){this.Ub=a};a.Vh.prototype.mh=function(){this.Rc||(this.Rc=new b(this));return this.Rc};a.Vh.prototype.WL=
function(a,b){this.$v.push(a);this.DEa[b]=a};a.Vh.prototype.pw=function(){return this.$v};a.Vh.prototype.Ay=function(){return this.DEa};a.Vh.prototype.fe=function(b){this.K.highlightedCategories=a.fb.clone(b);a.Qd.fe(b,this.pw(),"any"===this.K.highlightMatch);this.jk&&this.jk.fe(b)};a.Vh.prototype.select=function(b){this.K.selection=a.fb.clone(b);this.Kb&&this.Kb.ms(this.K.selection,this.pw())};a.Vh.prototype.Ke=function(b){b?this.K=this.Uf.Ho(b):this.K||(this.K=this.CA());b=this.K.selectionMode;
this.Kb="single"===b?new a.Kb(a.Kb.Dv):"multiple"===b?new a.Kb(a.Kb.Gs):null;this.u.Zy(this.Kb);a.m.Xk()||(this.K.animationOnDisplay="none",this.K.animationOnDataChange="none")};a.Vh.prototype.zk=function(){return a.I.Fd(this.A(),"componentName",a.I.ua,"TAG_CLOUD")};a.Vh.prototype.fza=function(){this.Wi&&(this.removeChild(this.Wi),this.Wi.vc(),this.Wi=null);this.xh&&(this.removeChild(this.xh),this.xh.vc(),this.xh=null);this.Ab&&this.u.Jf(this);this.K.highlightedCategories&&0<this.K.highlightedCategories.length&&
this.fe(this.K.highlightedCategories);this.Ej||this.Dl();this.Ab=null;this.Ej=!1};a.Vh.prototype.QZ=function(){this.u.cd();this.$v.length=0};a.Vh.prototype.Kf=function(b,d){var f=b.type;if("categoryHide"==f||"categoryShow"==f){var h=b.category,q=a.Z.fc(this.K.hiddenCategories,h);"categoryHide"==f&&0>q&&this.K.hiddenCategories.push(h);"categoryShow"==f&&0<=q&&this.K.hiddenCategories.splice(q,1);this.ha(this.K,this.Ra,this.eb)}else"categoryHighlight"==f&&(this!=d?this.fe(b.categories):this.jk&&this.jk!=
d&&this.jk.Kf(b,d));b&&this.dispatchEvent(b)};a.Vh.prototype.d5a=function(a){return this.Kb?a[0]:null};a.Vh.prototype.Q2a=function(a){a.pb()||(this.Kb.En(a,!1),this.u.wy());a=[];for(var b=this.Kb.getSelection(),d=0;d<b.length;d++){var f=b[d];f instanceof x&&a.push(f.getId())}return a};a.Vh.prototype.lq=function(){for(var a=[],b=this.Kb.getSelection(),d=0;d<b.length;d++)a=a.concat(b[d].be());return a};a.Vh.prototype.Dn=function(a,b,d){return this.Yo.Dn(d)};a.Vh.prototype.Ul=function(a,b){return this.Yo.Ul(a,
b)};a.Vh.prototype.zy=function(a,b){return this.Yo.zy(a,b)};a.Vh.prototype.CC=function(a,b){return this.Yo.CC(a,b)};a.i.v(b,a.Rc);b.prototype.Qm=function(a){return(a=this.dE.u.Xa(a))&&a instanceof x?"item["+this.dE.Ay().indexOf(a)+"]":null};b.prototype.Xg=function(b){if(b==a.Rc.cx)return this.DA(this.dE);var d=b.indexOf("[");return 0<d&&"item"===b.substring(0,d)&&(b=this.dE.Ay()[parseInt(b.substring(d+1,b.length-1))])?b.be()[0].pa():null};b.prototype.getItem=function(a){if(a=this.dE.Ay()[a]){var b=
{};b.color=a.Mi();b.tooltip=a.Zg();b.label=a.Oe();b.value=a.getValue();b.selected=a.pb();return b}return null};b.prototype.nV=function(){return this.dE.pw().length};a.i.v(h,a.Rb);h.TRa=.3;h.URa=.6;h.hda=0;h.a7=1;h.ida=2;h.prototype.Init=function(a,b,d,f,q,l,y,t,x){h.C.Init.call(this,b,d,f,q,l,x);this.dE=a;this.at();this.ec.Wa(y);this.ec.Ic(t);l&&this.pCa(l)};h.prototype.kc=function(a){this.xi!=a&&((this.xi=a)?this.Nl?this.tb(this.q$):this.tb(this.qaa):this.tb(this.RK))};h.prototype.Wc=function(){this.Nl||
(this.Nl=!0,this.xi?this.tb(this.q$):this.tb(this.Sma))};h.prototype.Cc=function(){this.xi?this.tb(this.qaa):this.tb(this.RK);this.Nl=!1};h.prototype.ag=function(b,f){var g=new a.zd(this.a,this,d.Vb(this.dE)),q=this.xf(),r=f.xf(),l=!1,y=r.O(a.j.ud),t=q.O(a.j.ud);if(y!=t){var x=this;this.tb(q.Wa(a.j.ud,y));g.da.X(a.L.F8,this,function(){return x.xf().O(a.j.ud)},function(b){x.tb(x.xf().Wa(a.j.ud,b))},t)}r=parseFloat(r.O(a.j.gi));q=parseFloat(q.O(a.j.gi));r!=q&&(l=!0,x=this,this.Qg(r),g.da.X(a.L.za,this,
function(){return parseFloat(x.xf().O(a.j.gi))},this.Qg,q));q=f.ob();r=this.ob();y=f.Tk();t=this.Tk();if(r!=q||l&&t!=y)t!=y&&(q=h.YTa(f,q,y)),this.qa(q),g.da.X(a.L.za,this,this.ob,this.qa,r);l=f.zb();q=this.zb();q!=l&&(this.Ya(l),g.da.X(a.L.za,this,this.zb,this.Ya,q));f.ja(0);b.add(g,h.a7)};h.prototype.ji=function(b){b.add(new a.Dg(this.a,this,d.Vb(this.dE)),h.hda)};h.prototype.zh=function(b){this.ja(0);b.add(new a.Tf(this.a,this,d.Vb(this.dE)),h.ida)};h.prototype.Qg=function(a){h.C.Qg.call(this,
a);this.pCa(this.xf())};h.prototype.pCa=function(b){this.RK=b.clone();b=this.RK.O(a.j.ud);this.RK.Wa(a.j.le,null);this.Sma=this.RK.clone();var d=h.JEa(b,h.TRa);this.Sma.Wa(a.j.le,d);this.Sma.Wa(a.j.ud,a.D.Rk(d));this.qaa=this.RK.clone();this.qaa.Wa(a.j.le,b);this.qaa.Wa(a.j.ud,a.D.Rk(b));this.q$=this.RK.clone();b=h.JEa(b,h.URa);this.q$.Wa(a.j.le,b);this.q$.Wa(a.j.ud,a.D.Rk(b))};h.YTa=function(b,d,f){b=b.xJa();return f==a.J.Ij?d+b.b:f==a.J.Gh?d-b.b:d};h.JEa=function(b,d){var f=a.D.rj(b),h=a.D.qj(b),
q=a.D.mj(b);return a.D.UC(Math.floor(255*(1-d)+d*f),Math.floor(255*(1-d)+d*h),Math.floor(255*(1-d)+d*q))};a.i.v(x,a.i);x.prototype.Init=function(b,d,f){this.La=b;this.cf=d;this.Fb=f;this.fB=this.xi=!1;f.url?(d.ug("link"),this.Lna=a.l.EL("_blank",f.url)):d.ug("img");this.fp()};x.prototype.getId=function(){return this.Fb.id};x.prototype.Oe=function(){return this.Fb.label};x.prototype.getValue=function(){return this.Fb.value};x.prototype.Zg=function(){return this.Fb.shortDesc};x.prototype.Ng=function(){return this.Fb.action};
x.prototype.rf=function(){var a=this.La.A().tooltip;return(a=a?a.renderer:null)?this.La.a.ef().jt(a,this.Sk()):this.Zg()};x.prototype.Sk=function(){return{id:this.getId(),label:this.Oe(),color:this.Mi(),value:this.getValue()}};x.prototype.EL=function(){return this.Lna};x.prototype.Mi=function(){return this.cf.RK.O(a.j.ud)};x.prototype.co=function(a){this.fB=a};x.prototype.ib=function(){return this.fB};x.prototype.pb=function(){return this.xi};x.prototype.kc=function(a){this.xi=a;this.cf.kc(a);this.fp()};
x.prototype.Wc=function(){this.cf.Wc()};x.prototype.Cc=function(){this.cf.Cc()};x.prototype.Kd=function(b){var d=this.La.u.Ba;return b.type==a.MouseEvent.Ie||d.Oo(b)?this:d.ci(b)?E.Kd(this,b,this.La.pw()):null};x.prototype.sd=function(a){return this.cf.ga(a)};x.prototype.gk=function(){return this.cf.pa()};x.prototype.Fh=function(){this.Yc=!0;this.Wc()};x.prototype.yf=function(){this.Yc&&(this.Yc=!1,this.Cc())};x.prototype.He=function(){return this.Yc};x.prototype.be=function(){return[this.cf]};x.prototype.ve=
function(){var b=[];this.ib()&&b.push(a.I.Ka(a.I.ua,this.pb()?"STATE_SELECTED":"STATE_UNSELECTED"));return a.R.ym(this.Zg(),b)};x.prototype.yd=function(){return this.Fb.categories};x.prototype.fp=function(){a.m.$j()||this.cf.Od("label",this.ve())};x.prototype.Ni=function(){if(!this.um&&(this.um=[],this.Fb.showPopupBehaviors))for(var b=this.Fb.showPopupBehaviors,d=0;d<b.length;d++)this.um.push(new a.jb(b[d].popupId,b[d].triggerType,b[d].alignId,b[d].align));return this.um};x.prototype.Dn=function(a){return this.La.d5a(a)};
x.prototype.Ul=function(){return this.La.Q2a(this)};x.prototype.lq=function(){return this.La.lq()};a.i.v(w,a.ma);w.Hg={animationOnDisplay:"none",animationOnDataChange:"none",emptyText:null,hiddenCategories:[],hideAndShowBehavior:"none",highlightedCategories:[],highlightMatch:"all",hoverBehavior:"none",layout:"rectangular",selectionMode:"none",_statusMessageStyle:new a.j(a.ma.tj+"color: #333333;"),styleDefaults:{animationDuration:500,hoverBehaviorDelay:200,_style:new a.j(a.ma.tj+"color: #333333;")},
touchResponse:"auto"};var f={};a.i.v(f,a.i);f.ha=function(a,b,d){f.Wn(a,b,d);f.XK(a,b,d);f.FD(d);var h=a.A();h.items&&0<h.items.length?(h=f.G2(a,b,d),0<h.length?(a.Mva(h),a.u.ps(a.pw()[0])):f.Cu(a,b,d)):f.Cu(a,b,d)};f.Cu=function(b,d,f){var h=b.A(),q=h.emptyText;q||(q=a.I.Fd(h,"labelNoData",a.I.ua,"NO_DATA",null));a.ea.Hm(d,q,new a.U(f.x,f.y,f.b,f.f),b.u,h._statusMessageStyle)};f.Wn=function(b,d,f){b=new a.Rect(b.a,f.x,f.y,f.b,f.f);b.dc();d.B(b)};f.G2=function(b,d,f){for(var w=b.A(),r=[],l=w.items,
y=Number.MAX_VALUE,t=-Number.MAX_VALUE,F=0;F<l.length;F++)y=Math.min(y,l[F].value),t=Math.max(t,l[F].value);var y=q.e3a(y,t),t=a.Z.wC(w.hiddenCategories),C=a.j.Qba(),D=w.styleDefaults,v=D.svgStyle||D.style;!v||v instanceof Object||(v=a.j.lL(v));for(F=0;F<l.length;F++){var z=l[F];z.categories||(z.categories=[z.label]);if(!t||!a.Z.$I(t,z.categories)){var k=D._style.clone(),A=z.svgStyle||z.style;!A||A instanceof Object||(A=a.j.lL(A));var J=A&&A.color?A.color:z.color?z.color:v&&v.color?v.color:null;if(A=
a.fb.ke(A,v)){for(var B=0;B<C.length;B++){var E=a.j.kE(C[B]);A[E]&&(k.Wa(C[B],A[E]),delete A[E])}delete A.color}J&&k.Wa(a.j.ud,J);k.Wa(a.j.gi,y.call(null,z.value).toString());k=new h(b,b.a,z.label,0,0,k,A,z.svgClassName||z.className,z.id);A=new x(b,k,z);b.u.Yb(k,A);b.WL(A,F);"none"!==w.selectionMode&&A.co(!0);(A.ib()||z.url||A.Ng())&&k.setCursor("pointer");r.push(k);d.B(k)}}0<r.length&&("cloud"===w.layout?q.k1a(f,r):q.k6a(f,r,a.m.ca(b.a)));return r};f.XK=function(b,d,f){var h=b.A(),q=h.legend;if(q&&
q.sections){q=a.fb.clone(q);q.orientation="horizontal";q.halign="center";q.hoverBehavior=h.hoverBehavior;q.hideAndShowBehavior=h.hideAndShowBehavior;q.hiddenCategories=h.hiddenCategories;h=a.zf.newInstance(b.a,b.Kf,b);d.B(h);var l=h.Zu(q,f.b,f.f/3);h.ha(q,l.b,l.f);a.gj.position(f,"bottom",h,l.b,l.f,0);b.jk&&(b.jk.vc(),d.removeChild(b.jk));b.jk=h}};f.FD=function(a){a.x=Math.round(a.x);a.y=Math.round(a.y);a.b=Math.round(a.b);a.f=Math.round(a.f)};a.i.v(q,a.i);q.e3a=function(a,b){return function(d){return 12+
Math.ceil(2*(d-a)/(b-a)*12)}};q.k1a=function(b,d){var f=[],h=10/180,q=10/180;b.b>b.f?h*=b.b/b.f:q*=b.f/b.b;for(var l=2*Math.PI/180,y=null,t=0,x=[],w=[],D=0;D<d.length;D++)for(var v=!1,z=0,k=4,A=d[D],J=A.ga(),t=Math.max(t,parseFloat(A.xf().O(a.j.gi))),B=-1;!v;){var E=z%180;void 0===x[E]&&(x[E]=Math.cos(z*l));void 0===w[E]&&(w[E]=Math.sin(z*l));var ha=h*z*x[E],ia=q*z*w[E],da=new a.U(ha,ia,J.b,J.f),v=!0;-1!=B&&f[B].$ba(da)&&(v=!1);if(v)for(E=0;E<D;E++)if(f[E].$ba(da)){B=E;v=!1;break}v&&(y=y?y.ql(da):
da,B=-1,f[D]=da,A.qa(ha),A.Ya(-J.y+ia));3600===z?k=3:5400===z?k=2:10800===z&&(k=1);z+=k}f=Math.max(y.b/b.b,y.f/b.f);h=y.x+y.b/2;y=y.y+y.f/2;for(E=0;E<d.length;E++)A=d[E],A.qa(b.x+A.ob()/f+(b.b/2-h/f)),A.Ya(b.y+A.zb()/f+(b.f/2-y/f)),q=parseFloat(A.xf().O(a.j.gi)),A.Qg(q/f)};q.k6a=function(b,d,f){for(var h=[],r=0,l=0,y=0,t=0;t<d.length;t++){var x=d[t],w=x.ga(),r=Math.max(r,w.b),l=Math.max(l,w.f),y=Math.max(y,parseFloat(x.xf().O(a.j.gi)));h.push(new a.eg(w.b,w.f))}t=0;for(x=(b.b-10)/r;.001<x-t;)r=(t+
x)/2,y=q.YBa(h,(b.b-10)/r),y.length*(r*l+2)-2>b.f-10?x=r:t=r;r=t;y=q.YBa(h,(b.b-10)/r);y.push(d.length);for(t=0;t<y.length-1;t++){var w=y[t],D=y[t+1],v=0,z=0,k=!0;if(1<D-w){for(var x=0,A=w;A<D;A++)x+=h[A].b*r,z=Math.max(z,h[A].f*r);v=(b.b-10-x)/(D-w-1);t==y.length-2&&(A=.5*z,A<v&&x+(D-w)*A<.9*(b.b-10)&&(v=A,k=!1))}for(var z=5+(t+1)*(l*r+2)-2,J=f?b.b-5:5,A=w;A<D;A++){var x=d[A],B=parseFloat(x.xf().O(a.j.gi));x.Qg(B*r);x.Ya(b.y+z);k&&A==D-1&&A!=w?f?(x.Vg(),x.qa(b.x+5)):(x.kh(),x.qa(b.x+b.b-5)):(x.qa(b.x+
J),f?(x.kh(),J-=h[A].b*r+v):(x.Vg(),J+=h[A].b*r+v))}}};q.YBa=function(a,b){var d=[0],f=a[0].b+2;if(1<a.length)for(var h=1;h<a.length;h++)f+a[h].b>b&&(d.push(h),f=0),f+=a[h].b+2;return d};var d={};a.i.v(d,a.i);d.Vb=function(a){return a.A().styleDefaults.animationDuration/1E3};a.i.v(B,a.u);B.prototype.EF=function(a){a=this.Xa(a.target);this.Cma(a);this.RP(a)};B.prototype.QM=function(a){a=this.Xa(a.target);this.RP(a)};B.prototype.xv=function(a){a=this.Xa(a.target);this.Cma(a);this.RP(a)};B.prototype.Cma=
function(a){a instanceof x&&(a=a.EL())&&a.call()};B.prototype.hm=function(b){var d=!0,f=this.Ne();b.keyCode==a.KeyboardEvent.ho?this.Cma(f):d=B.C.hm.call(this,b);return d};B.prototype.Kj=function(b,d,f){b=this.La.A();"dim"==b.hoverBehavior&&(d=d.yd?d.yd():[],b.highlightedCategories=f?d.slice():null,f=a.la.jJ(b.highlightedCategories,f),d=a.ab.qq(b.styleDefaults.hoverBehaviorDelay),this.MF.Kf(f,this.La.pw(),d,"any"==b.highlightMatch))};B.prototype.RP=function(b){b&&b.Ng&&b.Ng()&&this.Ct(a.la.Ry("action",
b.Ng(),b.getId()))};B.prototype.jz=function(){return this.La.A().touchResponse};a.i.v(E,a.Ba);E.prototype.Init=function(a){E.C.Init.call(this,a)};E.prototype.fA=function(a){return this.ci(a)&&!a.ctrlKey};E.prototype.Oo=function(b){return b.keyCode==a.KeyboardEvent.Mj&&b.ctrlKey};E.Kd=function(b,d,f){d=d.keyCode==a.KeyboardEvent.Je||d.keyCode==a.KeyboardEvent.tf?!0:!1;b=a.Z.fc(f,b)+(d?1:-1);return b<f.length&&0<=b?f[b]:null};a.i.v(function(){},a.vM);a.M(a,"TagCloud",a.Vh);a.M(a.Vh,"newInstance",a.Vh.newInstance);
a.M(a.Vh.prototype,"render",a.Vh.prototype.ha);a.M(a.Vh.prototype,"getAutomation",a.Vh.prototype.mh);a.M(a.Vh.prototype,"highlight",a.Vh.prototype.fe);a.M(a.Vh.prototype,"select",a.Vh.prototype.select);a.M(b.prototype,"getDomElementForSubId",b.prototype.Xg);a.M(b.prototype,"getItem",b.prototype.getItem);a.M(b.prototype,"getItemCount",b.prototype.nV)})(dvt);
  return dvt;
});
